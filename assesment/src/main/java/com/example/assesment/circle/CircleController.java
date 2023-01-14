package com.example.assesment.circle;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/methods")
public class CircleController {
    @PostMapping("/is_inside") //API endpoint
    public boolean isPointInside(@org.springframework.web.bind.annotation.RequestBody RequestBody request){
        Point point = new Point(request.getPoint().getX_coordinates(),
                request.getPoint().getY_coordinates());
        Circle circle = new Circle(request.getRadius(), request.getCenter());

        return circle.is_inside(point);
    }
}
